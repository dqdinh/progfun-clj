(defproject progfun-clj "0.1.0-SNAPSHOT"
  :description "Revisiting Coursera's Progfun course in Clojure because Scala is not a Lisp and that's a tragedy."
  :url "https://github.com/dqdinh/prog-fun-clj"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.trace  "0.7.8"]]
                   :source-paths ["dev"]}})
