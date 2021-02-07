(ns minimal-cljs-pixijs.core
  (:require [pixi.js :as px]))

(def app (px/Application. #js {:backgroundColor 0x1099bb}))
(.appendChild (. js/document -body) (. app -view))

(def egg (. px/Sprite from "assets/eggHead.png"))
(.set (.-anchor egg) 0.5)
(set! (.-x egg) (/ (.-width (.-screen app)) 2))
(set! (.-y egg) (/ (.-height (.-screen app)) 2))
(.addChild (.-stage app) egg)

(defn rotate-egg [delta]
  (set! (.-rotation egg)
        (+ (.-rotation egg)
           (* 0.1 delta))))

(.add (.-ticker app) rotate-egg)
;; (.remove (.-ticker app) rotate-egg)
