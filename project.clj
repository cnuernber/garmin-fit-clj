(defproject cnuernber/garmin-fit-clj "0.2-SNAPSHOT"
  :description "Clojure reader for garming fit files"
  :url "http://github.com/cnuernber/garmin-fit-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [techascent/tech.parallel "1.3"]
                 [camel-snake-kebab "0.4.0"]
                 [commons-io/commons-io "2.6"]]
  :resource-paths ["resources/fit.jar"])
