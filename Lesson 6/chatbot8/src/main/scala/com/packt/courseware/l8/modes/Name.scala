package com.packt.courseware.l8.modes
import com.packt.courseware.l8.{EffectsProvider, Processed}

case class Name(name:String) extends ChatbotMode {

  override def process(line: String)(implicit effects: EffectsProvider): Option[Processed] =
    line match {
      case "my name" => Some(Processed(name,this,false))
      case _ => None
    }

}
