(ns kata.wordwrap
  (:require [clojure.string :refer [trim] :as str]))

(defn wrap
  [s w]
  (loop [s s w w r ""]
    (cond (empty? s) r
          (> (count s) w) (let [b (.lastIndexOf s " " w)]
                            (if (= b -1) (recur (str/trim (subs s w)) w (str r (subs s 0 w) "\n"))
                                         (recur (str/trim (subs s b)) w (str r (subs s 0 b) "\n"))))
          :else (str r s))))