(ns minimal-cljs-pixijs.sprites
  (:require-macros [minimal-cljs-pixijs.sprites]))

(defn ^js get-sheet [^js app]
  (-> app .-loader .-resources (aget "resources/spritesheet.json")))
