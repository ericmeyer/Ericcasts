(ns ericcasts.controller.podcasts-controller
  (:use
    [compojure.core]
    [gaeshi.views :only (render-template)]))

(def podcasts-controller
  (->
    (routes
      (GET "/podcasts" [] (render-template "podcasts/index"))
      (GET "/podcasts/:id" [id] (render-template "podcasts/show" :podcast {:id id})))))
