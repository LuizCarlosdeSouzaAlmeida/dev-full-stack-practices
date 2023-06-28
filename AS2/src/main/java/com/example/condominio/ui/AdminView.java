package com.example.condominio.ui;

import com.example.condominio.backend.Morador;
import com.example.condominio.backend.MoradorService;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;
import org.vaadin.crudui.crud.impl.GridCrud;

@Route("admin")
@RolesAllowed("ADMIN")
public class AdminView extends VerticalLayout {
    public AdminView(MoradorService service) {
        var crudMorador = new GridCrud<>(Morador.class, service);
        crudMorador.getGrid().setColumns("nome","cpf","telefone");
        crudMorador.getCrudFormFactory().setVisibleProperties("nome","cpf","telefone");

        add(
                new H1("Admin view"),
                crudMorador
        );
    }
}
