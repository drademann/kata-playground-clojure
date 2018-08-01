;
; Requirements:
;
; Write a function to wrap a text at spaces when reaching a specific width.
;

(ns kata.wordwrap-test
  (:require [clojure.test :refer :all]
            [kata.wordwrap :refer :all]))

(deftest test-wrap
  (testing "wraps text"
    (is (= "" (wrap nil 1)))
    (is (= "" (wrap "" 1)))
    (is (= "x" (wrap "x" 1)))
    (is (= "x\nx" (wrap "xx" 1)))
    (is (= "x\nxx" (wrap "x xx" 3)))
    (is (= "x\nx\nx" (wrap "x x x" 2)))))
