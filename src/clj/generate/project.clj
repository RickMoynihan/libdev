(ns clj.generate.project
  (:require [clj.new.templates :as tmpl]
            [clj.generate.file :as gen-file]))

(def render (tmpl/renderer "libdev"))

(defn generate
  "Generate a new namespace relative to the prefix."
  [prefix project-coord]
  (if project-coord
    (let [data {:project project-coord}]

      (println "Generating project.clj")
      (tmpl/->files data
                    ["project.clj" (render "project.clj" data)]))

    (println "You must specify a group/project-name.  e.g. clj -m clj-new.generate project=foo/bar")))
