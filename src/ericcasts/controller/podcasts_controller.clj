(ns ericcasts.controller.podcasts-controller
  (:use
    [compojure.core]
    [gaeshi.views :only (render-template)]))

(def podcasts-controller
  (->
    (routes
      (GET "/podcasts" [] (render-template "podcasts/index"))
      (GET "/podcasts/:id" [id]
        (if (= "1" id)
          (render-template "podcasts/show" :podcast {:title "Complete History Of The Soviet Union, Arranged To The Melody Of Tetris" :youtube-id "hWTFG3J1CP8"})
          (render-template "podcasts/show" :podcast {:title "Thermite vs. Car" :youtube-id "rdCsbZf1_Ng"}))))))
