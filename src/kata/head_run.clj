(ns kata.head-run)

(defn count-head-runs
  "Counts the number of times coll contains two heads in a row"
  [coll]
  (loop [cnt 0 coll coll]
    (if (< (count coll) 2)
      cnt
      (if (= :h (first coll) (second coll))
        (recur (inc cnt) (rest coll))
        (recur cnt (rest coll))))))
