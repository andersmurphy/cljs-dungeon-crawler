(ns minimal-cljs-pixijs.core
  (:require [pixi.js :as px]))

;; (set! *warn-on-infer* true)

(def ^js app (px/Application. #js {:backgroundColor 0x1099bb}))
(-> js/document .-body (.appendChild (. app -view)))

(defn texture-for [resource-name]
  (let [^js r (-> app .-loader .-resources (aget resource-name))]
    (.-texture r)))

(defn rotate-egg [^js egg delta]
  (set! (.-rotation egg)
        (+ (.-rotation egg)
           (* 0.1 delta))))

(defn setup []
  (let [^js egg (px/Sprite. (texture-for "assets/eggHead.png"))]
    (-> egg .-anchor (.set 0.5))
    (set! (.-x egg) (/ (-> app .-screen .-width) 2))
    (set! (.-y egg) (/ (-> app .-screen .-height) 2))
    (-> app .-ticker (.add (partial rotate-egg egg)))
    (-> app .-stage (.addChild egg))))

(-> app .-loader (.add "assets/eggHead.png") (.load setup))
