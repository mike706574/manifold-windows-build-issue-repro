(defproject fun.mike/example-server "0.0.1-SNAPSHOT"
  :description "A project."
  :url "https://github.com/mike706574/manifold-windows-build-issue-repo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [manifold "0.1.6"]
                 [compojure "1.6.0"]] 
  :plugins [[org.clojure/tools.nrepl "0.2.12"]
            [lein-cloverage "1.0.10"]]
  :profiles {:dev {:source-paths ["dev"]
                   :target-path "target/dev"
                   :dependencies [[org.clojure/test.check "0.10.0-alpha2"]
                                  [org.clojure/tools.namespace "0.2.11"]]}
             :uberjar {:aot :all
                       :main example.main
                       :uberjar-name "experiment.jar"}})
