(ns minimal-cljs-pixijs.core
  (:require [pixi.js :as px]))

(def ^js app (px/Application. #js {:backgroundColor 0x1099bb}))

(.. js/document -body (appendChild (. app -view)))

(def egg (. px/Sprite from "assets/eggHead.png"))
(.. egg -anchor (set 0.5))
(set! (.-x egg) (/ (.. app -screen -width) 2))
(set! (.-y egg) (/ (.. app -screen -height) 2))

(.. app -stage (addChild egg))

(defn rotate-egg [delta]
  (set! (.-rotation egg)
        (+ (.-rotation egg)
           (* 0.1 delta))))
(.. app -ticker (add rotate-egg))
;; (.. app -ticker (remove rotate-egg))
