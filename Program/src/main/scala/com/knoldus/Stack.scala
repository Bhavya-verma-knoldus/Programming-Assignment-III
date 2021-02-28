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

import java.util.EmptyStackException
import scala.annotation.tailrec

class Stack {

  /*push method to push the element at the top of the stack*/
  def push(list: List[Int], value: Int): List[Int] = {
    @tailrec def pushNested(list: List[Int], value: Int,outputList: List[Int]): List[Int] = list match{

      /*Returns list after pushing element at the top of stack*/
      case Nil => outputList ::: List(value)

      /*Returns list after pushing element at the top of stack*/
      case head :: nil =>  outputList ::: List(value)

      /*Recursively calls pushNested method to reach at the top of stack*/
      case head :: tail => pushNested(tail,value,outputList)
    }
    pushNested(list,value,list)
  }

  /*pop method to pop the element from the top of the stack*/
  def pop(list: List[Int]): List[Int] = {
    @tailrec def popNested(list: List[Int],outputList: List[Int]): List[Int] = list match{

      /*Throws exception when stack is empty*/
      case Nil => throw new EmptyStackException()

      /*Returns list when reached to the last element*/
      case head :: Nil =>  outputList

      /*Recursively calls popNested method to reach at the top of the stack*/
      case head :: tail => popNested(tail,outputList ::: List(head))
    }
    popNested(list,Nil)
  }

  /*isEmpty method checks whether the stack is empty or not*/
  def isEmpty(list: List[Int]): Boolean = list match{

    /*When stack is empty*/
    case Nil => true

    /*When stack is not empty*/
    case _ => false
  }

  /*peek method to retrieve the element from the top of the stack*/
  def peek(list: List[Int]): Int = {
    @tailrec def peekNested(list: List[Int]): Int = list match {

      /*Throws exception when stack is empty*/
      case Nil => throw new EmptyStackException()

      /*Returns the element from the top of the stack*/
      case head :: Nil =>  head

      /*Recursively calls peekNested method to reach at the top of the stack*/
      case head :: tail => peekNested(tail)
    }
    peekNested(list)
  }

}
