(ns ericcasts.core
  (:use
    [compojure.core :only (defroutes GET)]
    [compojure.route :only (not-found)]
    [gaeshi.middleware.view-context :only (wrap-view-context)]
    [gaeshi.views :only (render-template render-html)]
    [gaeshi.controllers :only (controller-router)]))

(defroutes ericcasts-routes
  (GET "/" [] (render-template "index"))
  (controller-router 'ericcasts.controller)
  (not-found (render-template "not_found" :template-root "ericcasts/view" :ns `ericcasts.view.view-helpers)))

(def app-handler
  (->
    ericcasts-routes
    (wrap-view-context :template-root "ericcasts/view" :ns `ericcasts.view.view-helpers)))

