package com.absinthe.libchecker.ui.base

import android.view.View
import androidx.core.view.MenuProvider

interface IAppBarContainer {
  var currentMenuProvider: MenuProvider?
  fun scheduleAppbarLiftingStatus(isLifted: Boolean)
  fun setLiftOnScrollTargetView(targetView: View)
}