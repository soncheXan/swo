using EmpleadosAPI.Models;
using Microsoft.EntityFrameworkCore;

namespace EmpleadosAPI.Config
{
    public class DBEmpleadosContext : DbContext
    {
        public DBEmpleadosContext(DbContextOptions<DBEmpleadosContext> options) : base(options)
        {

        }

        public DbSet<Empleado> Empleados { get; set; }
    }
}
