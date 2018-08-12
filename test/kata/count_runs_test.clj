;
; Requirements:
;
; Write a function that counts the number of times a symbol is present
; in a row within a sequence.
;

(ns kata.count-runs-test
  (:require [clojure.test :refer :all])
  (:require [kata.count-runs :refer :all]))

(deftest test-count-run
  (testing "getting count of heads in a row"
    (is (= 0 (count-runs :h [])))
    (is (= 0 (count-runs :h [:h])))
    (is (= 0 (count-runs :h [:t])))
    (is (= 1 (count-runs :h [:h :h])))
    (is (= 2 (count-runs :h [:h :h :h])))
    (is (= 2 (count-runs :h [:t :h :h :t :h :h])))
    (is (= 1 (count-runs :h [:t :h :h]))))
  (testing "getting count of tails in a row"
    (is (= 0 (count-runs :t [])))
    (is (= 1 (count-runs :t [:h :t :t :h :h]))))
  (testing "defining own symbol"
    (is (= 0 (count-runs :my-sym [])))
    (is (= 1 (count-runs :my-sym [:my-sym :my-sym]))))
  (testing "defining own run length"
    (is (= 0 (count-runs 3 :h [])))
    (is (= 0 (count-runs 3 :h [:h :h])))
    (is (= 1 (count-runs 3 :h [:h :h :h])))))

