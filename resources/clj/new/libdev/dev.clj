(ns dev
  (:require
   [clojure.java.io :as io]
   [clojure.pprint :refer [pprint]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir doc find-doc pst source]]
   [clojure.test :refer [run-all-tests]]
   [clojure.tools.namespace.repl :refer [refresh refresh-all]]
   [clojure.spec.alpha :as s]
   [expound.alpha :as expound]))

(defmacro print-and-run
  "Print forms before we exceute them."
  [& forms]
  (cons 'do (map (fn [form]
                      `(do (pprint '~form)
                           ~form)) forms)))

(defn test-all []
  (run-all-tests #"{{name}}.*test$"))

(println "Welcome to the {{name}} dev REPL!")
(println)

(print-and-run

 (set! *print-length* 20)
 (s/check-asserts true)   ; enable asserts
 (alter-var-root #'s/*explain-out* (constantly expound/printer))

 )
