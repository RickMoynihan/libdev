(defproject {{project}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :plugins [[lein-tools-deps "0.4.1"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]

  ;; Dependencies provided by deps.edn are merged with any found in
  ;; your configured leiningen profile.

  ;;:dependencies [[clj-time "0.14.4"]]

  ;; How to resolve deps files
  :lein-tools-deps/config {:config-files [:install :user :project]})
