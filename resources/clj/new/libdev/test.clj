(ns {{main-ns}}-test
    (:require [{{name}} :as sut]
              [clojure.test :as t]))


(t/deftest foo-test
  (t/is (= true (sut/foo true))
        "True is true"))
