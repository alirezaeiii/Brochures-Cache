package com.android.sample.bonial.usecase

import com.android.sample.bonial.common.ViewState
import com.android.sample.bonial.domain.Brochure
import com.android.sample.bonial.repository.BrochureRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetBrochureUseCase @Inject constructor(
    private val brochureRepository: BrochureRepository
): UseCase {
    override fun invoke(): Flow<ViewState<List<Brochure>>> =
        brochureRepository.getBrochures()
}