(ns progfun-clj.recfun-test
  (:require [clojure.test :refer :all]
            [progfun-clj.recfun :refer :all]))

(deftest sum2-test
  (is (= 10 (sum2 [5 5]))))

(deftest max2-test
  (is (= 10 (max2 [5 10]))))
