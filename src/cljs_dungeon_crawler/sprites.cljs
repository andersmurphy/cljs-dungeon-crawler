(ns cljs-dungeon-crawler.sprites
  (:require-macros [cljs-dungeon-crawler.sprites]))

(defn ^js get-sheet [^js app]
  (-> app .-loader .-resources (aget "resources/spritesheet.json")))
