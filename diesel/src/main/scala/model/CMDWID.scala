/**  ____    __    ____  ____  ____,,___     ____  __  __  ____
 *  (  _ \  /__\  (_   )(_  _)( ___)/ __)   (  _ \(  )(  )(  _ \           Read
 *   )   / /(__)\  / /_  _)(_  )__) \__ \    )___/ )(__)(  ) _ <     README.txt
 *  (_)\_)(__)(__)(____)(____)(____)(___/   (__)  (______)(____/    LICENSE.txt
 */
package model

import razie.wiki.model.WID

/** a special command wid, contains a command, what and WID - used in play routes for proper REST resource
  * management
  *
  * i.e. for URLs like x/cat:name/xp/path - the wid is can:name, cmd is xp and rest is path - you can interpret these
  * in whichever way
  */
case class CMDWID(wpath: Option[String], wid: Option[WID], cmd: String, rest: String) {
  def hasGoodWid = wid.exists(!_.isEmpty)
}

