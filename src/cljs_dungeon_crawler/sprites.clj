(ns cljs-dungeon-crawler.sprites)

(def spritesheet
  {:meta {:image "spritesheet.png"
          :size {:w 512 :h 512}
          :scale "1"}
   :frames
   {:big_demon_idle_anim {:frame {:x "16" :y "16" :w "364" :h "32"}}
    :big_demon_run_anim {:frame {:x "144" :y "364" :w "32" :h "36"}}
    :big_zombie_idle_anim {:frame {:x "16" :y "270" :w "32" :h "34"}}
    :big_zombie_run_anim {:frame {:x "144" :y "270" :w "32" :h "34"}}

    :chest_empty_open_anim {:frame {:x "304" :y "288" :w "16" :h "16"}}
    :chest_full_open_anim {:frame {:x "304" :y "304" :w "16" :h "16"}}
    :chest_mimic_open_anim {:frame {:x "304" :y "320" :w "16" :h "16"}}

    :chort_idle_anim {:frame {:x "368" :y "328" :w "16" :h "24"}}
    :chort_run_anim {:frame {:x "432" :y "328" :w "16" :h "24"}}

    :coin_anim {:frame {:x "288" :y "272" :w "8" :h "8"}}

    :column_mid {:frame {:x "80" :y "96" :w "16" :h "16"}}
    :column_top {:frame {:x "80" :y "80" :w "16" :h "16"}}
    :column_base {:frame {:x "80" :y "112" :w "16" :h "16"}}

    :crate {:frame {:x "288" :y "298" :w "16" :h "22"}}

    :doors_all {:frame {:x "16" :y "221" :w "64" :h "35"}}
    :doors_frame_left {:frame {:x "16" :y "224" :w "16" :h "32"}}
    :doors_frame_righ {:frame {:x "63" :y "224" :w "16" :h "32"}}
    :doors_frame_top {:frame {:x "32" :y "221" :w "32" :h "3"}}
    :doors_leaf_closed {:frame {:x "32" :y "224" :w "32" :h "32"}}
    :doors_leaf_open {:frame {:x "80" :y "224" :w "32" :h "32"}}

    :edge {:frame {:x "96" :y "128" :w "16" :h "16"}}
    :hole {:frame {:x "96" :y "144" :w "16" :h "16"}}

    :elf_f_hit_anim {:frame {:x "256" :y "4" :w "16" :h "28"}}
    :elf_f_idle_anim {:frame {:x "128" :y "4" :w "16" :h "28"}}
    :elf_f_run_anim {:frame {:x "192" :y "4" :w "16" :h "28"}}
    :elf_m_hit_anim {:frame {:x "256" :y "36" :w "16" :h "28"}}
    :elf_m_idle_anim {:frame {:x "128" :y "36" :w "16" :h "28"}}
    :elf_m_run_anim {:frame {:x "192" :y "36" :w "16" :h "28"}}

    :flask_big_blue {:frame {:x "304" :y "224" :w "16" :h "16"}}
    :flask_big_green {:frame {:x "320" :y "224" :w "16" :h "16"}}
    :flask_big_red {:frame {:x "288" :y "224" :w "16" :h "16"}}
    :flask_big_yellow {:frame {:x "336" :y "224" :w "16" :h "16"}}
    :flask_blue {:frame {:x "304" :y "240" :w "16" :h "16"}}
    :flask_green {:frame {:x "320" :y "240" :w "16" :h "16"}}
    :flask_red {:frame {:x "288" :y "240" :w "16" :h "16"}}
    :flask_yellow {:frame {:x "336" :y "240" :w "16" :h "16"}}

    :floor_1 {:frame {:x "16" :y "64" :w "16" :h "16"}}
    :floor_2 {:frame {:x "32" :y "64" :w "16" :h "16"}}
    :floor_3 {:frame {:x "48" :y "64" :w "16" :h "16"}}
    :floor_4 {:frame {:x "16" :y "80" :w "16" :h "16"}}
    :floor_5 {:frame {:x "32" :y "80" :w "16" :h "16"}}
    :floor_6 {:frame {:x "48" :y "80" :w "16" :h "16"}}
    :floor_7 {:frame {:x "16" :y "96" :w "16" :h "16"}}
    :floor_8 {:frame {:x "32" :y "96" :w "16" :h "16"}}
    :floor_ladder {:frame {:x "48" :y "96" :w "16" :h "16"}}
    :floor_spikes_anim {:frame {:x "16" :y "176" :w "16" :h "16"}}

    :goblin_idle_anim {:frame {:x "368" :y "32" :w "16" :h "16"}}
    :goblin_run_anim {:frame {:x "432" :y "32" :w "16" :h "16"}}

    :ice_zombie_idle_anim {:frame {:x "432" :y "144" :w "16" :h "16"}}
    :ice_zombie_run_anim {:frame {:x "432" :y "144" :w "16" :h "16"}}

    :imp_idle_anim {:frame {:x "368" :y "48" :w "16" :h "16"}}
    :imp_run_anim {:frame {:x "432" :y "48" :w "16" :h "16"}}

    :knight_f_hit_anim {:frame {:x "256" :y "68" :w "16" :h "28"}}
    :knight_f_idle_anim {:frame {:x "128" :y "68" :w "16" :h "28"}}
    :knight_f_run_anim {:frame {:x "192" :y "68" :w "16" :h "28"}}
    :knight_m_hit_anim {:frame {:x "256" :y "100" :w "16" :h "28"}}
    :knight_m_idle_anim {:frame {:x "128" :y "100" :w "16" :h "28"}}
    :knight_m_run_anim {:frame {:x "192" :y "100" :w "16" :h "28"}}

    :lizard_f_hit_anim {:frame {:x "256" :y "196" :w "16" :h "28"}}
    :lizard_f_idle_anim {:frame {:x "128" :y "196" :w "16" :h "28"}}
    :lizard_f_run_anim {:frame {:x "192" :y "196" :w "16" :h "28"}}
    :lizard_m_hit_anim {:frame {:x "256" :y "228" :w "16" :h "28"}}
    :lizard_m_idle_anim {:frame {:x "128" :y "228" :w "16" :h "28"}}
    :lizard_m_run_anim {:frame {:x "192" :y "228" :w "16" :h "28"}}

    :masked_orc_idle_anim {:frame {:x "368" :y "172" :w "16" :h "20"}}
    :masked_orc_run_anim {:frame {:x "432" :y "172" :w "16" :h "20"}}

    :muddy_idle_anim {:frame {:x "368" :y "112" :w "16" :h "16"}}
    :muddy_run_anim {:frame {:x "368" :y "112" :w "16" :h "16"}}

    :necromancer_idle_anim {:frame {:x "368" :y "268" :w "16" :h "20"}}
    :necromancer_run_anim {:frame {:x "368" :y "268" :w "16" :h "20"}}

    :ogre_idle_anim {:frame {:x "" :y "16" :w "320" :h "32"}}
    :ogre_run_anim {:frame {:x "144" :y "320" :w "32" :h "32"}}

    :orc_shaman_idle_anim {:frame {:x "368" :y "236" :w "16" :h "20"}}
    :orc_shaman_run_anim {:frame {:x "432" :y "236" :w "16" :h "20"}}
    :orc_warrior_idle_anim {:frame {:x "368" :y "204" :w "16" :h "20"}}
    :orc_warrior_run_anim {:frame {:x "432" :y "204" :w "16" :h "20"}}

    :skelet_idle_anim {:frame {:x "368" :y "80" :w "16" :h "16"}}
    :skelet_run_anim {:frame {:x "432" :y "80" :w "16" :h "16"}}

    :skull {:frame {:x "288" :y "320" :w "16" :h "16"}}

    :swampy_idle_anim {:frame {:x "432" :y "112" :w "16" :h "16"}}
    :swampy_run_anim {:frame {:x "432" :y "112" :w "16" :h "16"}}

    :tiny_zombie_idle_anim {:frame {:x "368" :y "16" :w "16" :h "16"}}
    :tiny_zombie_run_anim {:frame {:x "432" :y "16" :w "16" :h "16"}}

    :ui_heart_empty {:frame {:x "320" :y "256" :w "16" :h "16"}}
    :ui_heart_full {:frame {:x "288" :y "256" :w "16" :h "16"}}
    :ui_heart_half {:frame {:x "304" :y "256" :w "16" :h "16"}}

    :wall_banner_blue {:frame {:x "32" :y "32" :w "16" :h "16"}}
    :wall_banner_green {:frame {:x "16" :y "48" :w "16" :h "16"}}
    :wall_banner_red {:frame {:x "16" :y "32" :w "16" :h "16"}}
    :wall_banner_yellow {:frame {:x "32" :y "48" :w "16" :h "16"}}

    :wall_column_mid {:frame {:x "96" :y "96" :w "16" :h "16"}}
    :wall_column_top {:frame {:x "96" :y "80" :w "16" :h "16"}}
    :wall_column_base {:frame {:x "96" :y "112" :w "16" :h "16"}}

    :wall_corner_bottom_left {:frame {:x "32" :y "144" :w "16" :h "16"}}
    :wall_corner_bottom_right {:frame {:x "48" :y "144" :w "16" :h "16"}}
    :wall_corner_front_left {:frame {:x "32" :y "160" :w "16" :h "16"}}
    :wall_corner_front_right {:frame {:x "48" :y "160" :w "16" :h "16"}}
    :wall_corner_left {:frame {:x "32" :y "128" :w "16" :h "16"}}
    :wall_corner_right {:frame {:x "48" :y "128" :w "16" :h "16"}}
    :wall_corner_top_left {:frame {:x "32" :y "112" :w "16" :h "16"}}
    :wall_corner_top_right {:frame {:x "48" :y "112" :w "16" :h "16"}}

    :wall_fountain_basin_blue_anim {:frame {:x "64" :y "64" :w "16" :h "16"}}
    :wall_fountain_basin_red_anim {:frame {:x "64" :y "32" :w "16" :h "16"}}
    :wall_fountain_mid_blue_anim {:frame {:x "64" :y "48" :w "16" :h "16"}}
    :wall_fountain_mid_red_anim {:frame {:x "64" :y "16" :w "16" :h "16"}}
    :wall_fountain_top {:frame {:x "64" :y "0" :w "16" :h "16"}}

    :wall_goo {:frame {:x "64" :y "80" :w "16" :h "16"}}
    :wall_goo_base {:frame {:x "64" :y "96" :w "16" :h "16"}}

    :wall_hole_1 {:frame {:x "48" :y "32" :w "16" :h "16"}}
    :wall_hole_2 {:frame {:x "48" :y "48" :w "16" :h "16"}}

    :wall_inner_corner_l_top_left {:frame {:x "80" :y "128" :w "16" :h "16"}}
    :wall_inner_corner_l_top_rigth {:frame {:x "64" :y "128" :w "16" :h "16"}}
    :wall_inner_corner_mid_left {:frame {:x "80" :y "144" :w "16" :h "16"}}
    :wall_inner_corner_mid_rigth {:frame {:x "64" :y "144" :w "16" :h "16"}}
    :wall_inner_corner_t_top_left {:frame {:x "80" :y "160" :w "16" :h "16"}}
    :wall_inner_corner_t_top_rigth {:frame {:x "64" :y "160" :w "16" :h "16"}}

    :wall_left {:frame {:x "16" :y "16" :w "16" :h "16"}}
    :wall_mid {:frame {:x "32" :y "16" :w "16" :h "16"}}
    :wall_right {:frame {:x "48" :y "16" :w "16" :h "16"}}

    :wall_side_front_left {:frame {:x "0" :y "144" :w "16" :h "16"}}
    :wall_side_front_right {:frame {:x "16" :y "144" :w "16" :h "16"}}
    :wall_side_mid_left {:frame {:x "0" :y "128" :w "16" :h "16"}}
    :wall_side_mid_right {:frame {:x "16" :y "128" :w "16" :h "16"}}
    :wall_side_top_left {:frame {:x "0" :y "112" :w "16" :h "16"}}
    :wall_side_top_right {:frame {:x "16" :y "112" :w "16" :h "16"}}

    :wall_top_left {:frame {:x "16" :y "0" :w "16" :h "16"}}
    :wall_top_mid {:frame {:x "32" :y "0" :w "16" :h "16"}}
    :wall_top_right {:frame {:x "48" :y "0" :w "16" :h "16"}}

    :weapon_anime_sword {:frame {:x "322" :y "81" :w "12" :h "30"}}
    :weapon_axe {:frame {:x "341" :y "90" :w "9" :h "21"}}
    :weapon_baton_with_spikes {:frame {:x "323" :y "57" :w "10" :h "22"}}
    :weapon_big_hammer {:frame {:x "291" :y "42" :w "10" :h "37"}}
    :weapon_cleaver {:frame {:x "310" :y "124" :w "8" :h "19"}}
    :weapon_duel_sword {:frame {:x "325" :y "113" :w "9" :h "30"}}
    :weapon_golden_sword {:frame {:x "291" :y "153" :w "10" :h "22"}}
    :weapon_green_magic_staff {:frame {:x "340" :y "145" :w "8" :h "30"}}
    :weapon_hammer {:frame {:x "307" :y "55" :w "10" :h "24"}}
    :weapon_katana {:frame {:x "293" :y "82" :w "6" :h "29"}}
    :weapon_knife {:frame {:x "293" :y "18" :w "6" :h "13"}}
    :weapon_knight_sword {:frame {:x "339" :y "114" :w "10" :h "29"}}
    :weapon_lavish_sword {:frame {:x "307" :y "145" :w "10" :h "30"}}
    :weapon_mace {:frame {:x "339" :y "55" :w "10" :h "24"}}
    :weapon_machete {:frame {:x "294" :y "121" :w "5" :h "22"}}
    :weapon_red_gem_sword {:frame {:x "339" :y "26" :w "10" :h "21"}}
    :weapon_red_magic_staff {:frame {:x "324" :y "145" :w "8" :h "30"}}
    :weapon_regular_sword {:frame {:x "323" :y "26" :w "10" :h "21"}}
    :weapon_rusty_sword {:frame {:x "307" :y "26" :w "10" :h "21"}}
    :weapon_saw_sword {:frame {:x "307" :y "86" :w "10" :h "25"}}
    :weapon_spear {:frame {:x "293" :y "177" :w "6" :h "30"}}

    :wizzard_f_hit_anim {:frame {:x "256" :y "132" :w "16" :h "28"}}
    :wizzard_f_idle_anim {:frame {:x "128" :y "132" :w "16" :h "28"}}
    :wizzard_f_run_anim {:frame {:x "192" :y "132" :w "16" :h "28"}}
    :wizzard_m_hit_anim {:frame {:x "256" :y "164" :w "16" :h "28"}}
    :wizzard_m_idle_anim {:frame {:x "128" :y "164" :w "16" :h "28"}}
    :wizzard_m_run_anim {:frame {:x "192" :y "164" :w "16" :h "28"}}

    :wogol_idle_anim {:frame {:x "368" :y "300" :w "16" :h "20"}}
    :wogol_run_anim {:frame {:x "432" :y "300" :w "16" :h "20"}}

    :zombie_idle_anim {:frame {:x "368" :y "144" :w "16" :h "16"}}
    :zombie_run_anim {:frame {:x "368" :y "144" :w "16" :h "16"}}}})

(def sprite-keys
  (-> spritesheet :frames keys set))

(defmacro texture-for
  "Throws compile time error if k is not a valid sprite key."
  [k]
  (let [resolved-k (if (symbol? k) @(resolve 'k) k)]
    (assert (sprite-keys resolved-k)
            (str resolved-k " is not a valid sprite key.")))
  (let [k-string (-> k name str)]
    `(-> (get-sheet cljs-dungeon-crawler.core/app) .-textures (aget ~k-string))))
