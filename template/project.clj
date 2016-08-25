(defproject cata "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [funcool/catacumba "1.0.0"]]
  :main ^:skip-aot cata.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
