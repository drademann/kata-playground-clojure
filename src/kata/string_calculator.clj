(ns kata.string-calculator
  (:require [clojure.string :as str]))

(defn calc
  [s]
  (letfn [(delim [d] (re-pattern (str "[" d "\n]")))
          (sumUp [s d] (reduce + (map #(Integer/parseInt %) (str/split (str/trim s) (delim d)))))]
    (cond (empty? s) 0
          (.startsWith s "//") (sumUp (.substring s 3) (.charAt s 2))
          :else (sumUp s ","))))