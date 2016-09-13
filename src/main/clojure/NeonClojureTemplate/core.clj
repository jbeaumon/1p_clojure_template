(ns neonClojureTemplate.core
  (:import (com.thomsonreuters.client.profile.impl ProfileServiceClientImpl) 
           (io.netty.buffer ByteBuf)
           (java.nio.charset Charset)
          )
  (:gen-class))

(def testTruid "ee3faaf5-1000-4cb5-9a29-88468106e1f8")
(def profileClient (ProfileServiceClientImpl.))
(def byteBuf (.execute (.getUser profileClient testTruid)))
(def userJson (.toString byteBuf (.forName Charset "UTF-8")))


(def l (list 1 2 3 4 5))

(defn -main
 "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn print-test [phrase]
 (println phrase))

(defn parse-args  [args]
    (into  {}  (map  (fn  [[k v]]  [(keyword  (.replace k "--" "")) v])
                                    (partition 2 args))))
