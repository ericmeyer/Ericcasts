(let [podcast (:podcast *view-context*)]
  [:div
    [:a {:href "/podcasts"} "Home"]
    [:h1 (:title podcast)]
    [:iframe {:type "text/html"
              :width "640"
              :height "385"
              :src (str "http://www.youtube.com/embed/" (:youtube-id podcast))
              :frameborder "0"}]
  ])
