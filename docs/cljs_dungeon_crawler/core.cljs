(ns cljs-dungeon-crawler.core
  (:require [pixi.js :as px]
            [cljs-dungeon-crawler.sprites :as sprites]))

;; (set! *warn-on-infer* true)

(def ^js app (px/Application.
              #js {:width       256
                   :height      256
                   :antialias   true
                   :transparent false
                   :resolution  1}))
(-> js/document .-body (.appendChild (. app -view)))

(def tile-size 16)

(defn tile->texture-init []
  {:w  (sprites/texture-for :wall_mid)
   :f  (sprites/texture-for :floor_1)})

(def dungeon
  (for [y (range 0 16)
        x (range 0 16)]
    {:x x
     :y y
     :tile (if (or (#{0 15} x) (#{0 15} y)) :w :f)}))

(defn clear-stage []
  (-> app .-stage (.removeChildren)))

(defn add-tile [tile->texture {:keys [tile x y]}]
  (let [^js block (px/Sprite. (tile->texture tile))]
    (set! (.-x block) (* tile-size x))
    (set! (.-y block) (* tile-size y))
    (-> app .-stage (.addChild block))))

(defn setup []
  (let [tile->texture (tile->texture-init)]
    (clear-stage)
    (mapv (partial add-tile tile->texture) dungeon)))

(-> app .-loader (.add "resources/spritesheet.json") (.load setup))
