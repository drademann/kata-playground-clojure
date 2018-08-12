(ns kata.head-run-test
  (:require [clojure.test :refer :all])
  (:require [kata.head-run :refer :all]))

(deftest test-head-run
  (testing "getting count of heads in a row"
    (is (= 0 (count-head-runs [])))
    (is (= 0 (count-head-runs [:h])))
    (is (= 0 (count-head-runs [:t])))
    (is (= 1 (count-head-runs [:h :h])))))