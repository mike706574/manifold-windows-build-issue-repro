(ns example.core
  (:require [compojure.response :refer [Renderable]]))

(extend-protocol Renderable
 manifold.deferred.IDeferred
 (render [d _] d))
