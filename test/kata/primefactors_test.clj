;
; Requirements:
;
; For an integer value n the generator should return all prime factors
; as an ordered list.
;

(ns kata.primefactors-test
  (:require [clojure.test :refer :all])
  (:require [kata.primefactors :refer  :all]))

(deftest test-generate-primefactors
  (testing "generation of prime factors for"
    (is (= (generate-primefactors 1) []))
    (is (= (generate-primefactors 2) [2]))
    (is (= (generate-primefactors 3) [3]))
    (is (= (generate-primefactors 4) [2 2]))
    (is (= (generate-primefactors 6) [2 3]))
    (is (= (generate-primefactors 8) [2 2 2]))
    (is (= (generate-primefactors 9) [3 3]))))