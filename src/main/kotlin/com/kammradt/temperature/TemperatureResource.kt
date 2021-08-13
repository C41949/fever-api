package com.kammradt.temperature

import com.kammradt.common.annotation.Status
import org.jboss.resteasy.annotations.Form
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Path("/temperature")
@Produces(MediaType.APPLICATION_JSON)
class TemperatureResource {

    @Inject
    lateinit var service: TemperatureService

    @POST
    @Status(Response.Status.CREATED)
    fun create(): Temperature = service.create()

    @GET
    @Status(Response.Status.CREATED)
    fun list(@Form params: PeriodParams): List<Temperature> = service.list(Period(params))

}