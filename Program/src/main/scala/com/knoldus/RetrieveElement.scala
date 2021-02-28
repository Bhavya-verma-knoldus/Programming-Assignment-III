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

class RetrieveElement {
  def getLastElement[AnyDataType](list: List[AnyDataType]): (AnyDataType,Int) ={

    @tailrec def getLastElementNested[AnyDataType](list: List[AnyDataType],index: Int): (AnyDataType,Int) = list match {

      /*Returns last element and index value when list has only 1 element*/
      case head :: Nil => (head,index)

      /*Recursively calls lastElement method when list has more than 1 element*/
      case _ :: tail => getLastElementNested(tail,index + 1)

      /*Throws exception when list is empty*/
      case _ => throw new NoSuchElementException("Empty list found")
    }

    getLastElementNested(list,0)
  }
}
