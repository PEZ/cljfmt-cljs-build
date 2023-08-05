(ns repro.script
  (:require [cljfmt.core :as cljfmt]))

(defn ^:export main [& _args]
  (-> "( a )"
      (doto #(println "Reforatting:" %))
      (cljfmt/reformat-string)
      (println)))