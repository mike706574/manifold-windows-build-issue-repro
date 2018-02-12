(ns example.core
  (:require [compojure.response :refer [Renderable]]))

(extend-protocol Renderable
  manifold.stream.SourceProxy
  (render [s _] s))
