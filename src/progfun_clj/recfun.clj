(ns progfun-clj.recfun)

(def values [1 2 4])

(defn sum2 [vals]
  "Recursively adds all elements in a list"
  (loop [acc 0 v vals]
    (if (empty? v)
      acc
      (recur (+ acc (first v)) (rest v)))))

(defn max2 [vals]
  "Recursively finds the max value in a list
  by pairwise comparison. Max defaults to first
  value."
  (reduce (fn [x y]
            (if > x y)
              x
              y)
          vals))

