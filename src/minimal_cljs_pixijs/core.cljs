(ns minimal-cljs-pixijs.core
  (:require [pixi.js :as px]
            [minimal-cljs-pixijs.sprites :as sprites]))

;; (set! *warn-on-infer* true)

(def ^js app (px/Application.
              #js {:width       256
                   :height      256
                   :antialias   true
                   :transparent false
                   :resolution  1}))
(-> js/document .-body (.appendChild (. app -view)))

(defn rotate-block [^js block delta]
  (set! (.-rotation block) (+ (.-rotation block) (* 0.1 delta))))

(defn setup []
  (let [^js block (px/Sprite. (sprites/texture-for :wall_left))]
    (set! (.-x block) (/ (-> app .-screen .-width) 2))
    (set! (.-y block) (/ (-> app .-screen .-height) 2))
    (-> app .-ticker (.add (partial rotate-block block)))
    (-> app .-stage (.addChild block))))

(-> app .-loader (.add "resources/spritesheet.json") (.load setup))
