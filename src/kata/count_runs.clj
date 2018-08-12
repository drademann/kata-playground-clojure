(ns kata.count-runs)

(defn count-runs
  "Counts the number of times coll contains n heads in a row. Uses 2 if n isn't provided."
  ([sym coll]
   (count-runs 2 sym coll))
  ([n sym coll]
   (count (filter (fn [subcoll] (every? #(= sym %) subcoll)) (partition n 1 coll)))))

