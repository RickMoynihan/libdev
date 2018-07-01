(ns user)

(defn dev []
  (println "Starting dev REPL")
  (require 'dev)
  (in-ns 'dev))

(println "Welcome to the {{name}} REPL.")
(println)
(println "Run: (dev)")
