package org.mozilla.fenix.helpers

import org.mozilla.experiments.nimbus.GleanPlumbMessageHelper
import org.mozilla.fenix.ext.components
import org.mozilla.fenix.helpers.TestHelper.appContext

object Experimentation {
    private val nimbus =
        appContext.components.analytics.experiments

    fun withHelper(block: GleanPlumbMessageHelper.() -> Unit) {
        val helper = nimbus.createMessageHelper()
        block(helper)
    }

}
