using EmpleadosAPI.Config;
using EmpleadosAPI.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace EmpleadosAPI.Controllers
{
    public class EmpleadoController : Controller
    {
        private readonly DBEmpleadosContext _context;
        public EmpleadoController(DBEmpleadosContext context)
        {
            _context = context;
        }

        [HttpGet("list")]
        public async Task<ActionResult<List<Empleado>>> Get()
        {
            return await _context.Empleados.ToListAsync();
        }

        [HttpPost("save")]
        public async Task<ActionResult> Post(Empleado empleado)
        {
            _context.Add(empleado);
            await _context.SaveChangesAsync();
            return Ok();
        }
    }
}
