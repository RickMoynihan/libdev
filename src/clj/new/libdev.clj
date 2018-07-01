(ns clj.new.libdev
  (:require [clj.new.templates :refer [renderer project-name name-to-path ->files
                                       multi-segment sanitize-ns]]))

(def render (renderer "libdev"))

(defn libdev
  "Create a clojure template with basic dev configuration"
  [name]
  (let [data {:name (project-name name)
              :main-ns (multi-segment (sanitize-ns name))
              :sanitized (name-to-path name)}]

    (println "Generating fresh 'clj new' libdev project.")
    (->files data
             "env/dev"
             ["env/dev/user.clj" (render "user.clj" data)]
             ["env/dev/dev.clj" (render "dev.clj" data)]
             ["deps.edn" (render "deps.edn" data)]
             ["src/{{sanitized}}.clj" (render "foo.clj" data)]
             ["test/{{sanitized}}_test.clj" (render "test.clj" data)])))
