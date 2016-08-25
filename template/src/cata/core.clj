(ns cata.core
  (:gen-class))

(ns cata.core
  (:require [catacumba.core :as ct])
  (:gen-class))

(defn example-handler
  [context]
  "Hello World")

(def app
  (ct/routes [[:all "" example-handler]
              [:get "foobar" example-handler]]))

(defn -main
  [& args]
  (let [port (Integer/parseInt (get (System/getenv) "OPENSHIFT_CLOJURE_HTTP_PORT" "8080"))]
  (ct/run-server app {:port port})))
