;
; Requirements:
;
; Write a function to wrap a text at spaces when reaching a specific width.
;

(ns kata.wordwrap
  (:require [clojure.test :refer :all]
            [kata.wordwrap :refer :all]
            [clojure.string :refer [trim] :as str]))

(defn wrap
  [s w]
  (loop [s s w w r ""]
    (cond (empty? s) r
          (> (count s) w) (let [b (.lastIndexOf s " " w)]
                            (if (= b -1) (recur (str/trim (subs s w)) w (str r (subs s 0 w) "\n"))
                                         (recur (str/trim (subs s b)) w (str r (subs s 0 b) "\n"))))
          :else (str r s))))

(deftest test-wrap
  (testing "wraps text"
    (is (= "" (wrap nil 1)))
    (is (= "" (wrap "" 1)))
    (is (= "x" (wrap "x" 1)))
    (is (= "x\nx" (wrap "xx" 1)))
    (is (= "x\nxx" (wrap "x xx" 3)))
    (is (= "x\nx\nx" (wrap "x x x" 2)))))
