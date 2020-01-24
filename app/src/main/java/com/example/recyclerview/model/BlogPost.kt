package com.example.recyclerview.model

import kotlin.collections.ArrayList

data class BlogPost(val autor: String, val foto: String, val titulo: String, val fecha: Long, val hashtags: Array<Hashtag>)