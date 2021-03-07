(ns package-resources
  (:require [clojure.data.json :as json]
            [cljs-dungeon-crawler.sprites :as sprites]))

(defn -main []
  (->> sprites/spritesheet
       json/write-str
       (spit "docs/resources/spritesheet.json")))
