// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus

import scala.annotation.tailrec

class Queue {

  /*add method to add the element at the front of the queue*/
  def add(list: List[Int], value: Int): List[Int] = {

    /*Add element at the front of the queue*/
    value :: list
  }

  /*remove method to remove the element from the end of the queue*/
  def remove(list: List[Int]): List[Int] = {
    @tailrec def removeNested(list: List[Int],outputList: List[Int]): List[Int] = list match{

      /*Throws exception when queue is empty*/
      case Nil => throw new NoSuchElementException("Queue is empty")

      /*Returns list after removing element from the end of the queue*/
      case head :: Nil =>  outputList

      /*Recursively calls removeNested method to reach at the end of the queue */
      case head :: tail => removeNested(tail,outputList ::: List(head))
    }
    removeNested(list,Nil)
  }

  /*isEmpty method checks whether the queue is empty or not*/
  def isEmpty(list: List[Int]): Boolean = list match{

    /*When queue is empty*/
    case Nil => true

    /*When queue is not empty*/
    case _ => false
  }

  /*peek method to view the head of the queue*/
  def peek(list: List[Int]): Int = list match {

    /*Throws exception when queue is empty*/
    case Nil => throw new NoSuchElementException("Queue is empty")

    /*Returns the head of the queue*/
    case head :: _ => head
  }

}
