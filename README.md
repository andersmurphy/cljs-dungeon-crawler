## Local Development

Install dependencies:

`yarn install`

Start repl:

`clojure -A:build; clojure -M:dev`

## Deploy

Production build:

`clojure -A:build; clojure -M:prod`

Push changes and the project will deploy automatically to:

https://andersmurphy.github.io/cljs-dungeon-crawler/
