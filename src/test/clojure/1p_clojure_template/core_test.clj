(ns clojuretemplate.core-test
  (:gen-class)
  (use clojure.test)
  (use 1p_clojure_template.core))

(deftest pairs-of-values
  (let  [args  ["--server" "localhost"
                "--port" "59617"
                "--environment" "localDev"]]
             (is  (=  {:server "localhost"
                       :port "59617"
                       :environment "localDev"}
  (parse-args args)))))

(deftest l-size
  (is (= 5 (count l)))
  )
