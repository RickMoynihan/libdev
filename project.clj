(defproject libdev/clj-template "0.1.1"
  :description "A clj-new template for building Clojure libraries with bespoke a dev environment & tooling"
  :url "https://github.com/RickMoynihan/libdev"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :plugins [[lein-tools-deps "0.4.1"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]

  ;; Dependencies provided by deps.edn are merged with any found in
  ;; your configured leiningen profile.

  ;;:dependencies [[clj-time "0.14.4"]]

  ;; How to resolve deps files
  :lein-tools-deps/config {:config-files [:install :user :project]}

  :deploy-repositories [["releases" :clojars]])
