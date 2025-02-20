(defproject karabiner-configurator "0.1.0"
  :description "karabiner configuration manager"
  :url "http://https://github.com/yqrashawn/GokuRakuJoudo"
  :license {:name "GNU General Public License v3.0"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :main karabiner-configurator.core
  :aot :all
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/tools.cli "1.0.206"]
                 [me.raynes/fs "1.4.6"]
                 [cheshire "5.10.2"]
                 [environ "1.2.0"]
                 [com.github.clj-easy/graal-build-time "0.1.4"]]
  :plugins [[lein-cloverage "1.2.3"]
            [lein-environ "1.2.0"]]
  :profiles {:dev  {:env {:is-dev true}}
             :test {:env {:is-dev true}}})


